package com.cyberark.controller;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.cyberark.model.*;
import com.cyberark.repository.BhActivityCenterIgnoreRepository;
import com.cyberark.repository.BhActivityRepository;
import com.cyberark.repository.BhCandidateRepository;

import javax.persistence.EntityManager;

import javax.persistence.Transient;
import javax.persistence.metamodel.Attribute;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class QueryBuilderController {
    @Autowired
    private BhCandidateRepository bhCandidateRepository;
    @Autowired
    private BhActivityRepository bhActivityRepository;
    @Autowired
    private BhActivityCenterIgnoreRepository bhActivityCenterIgnoreRepository;
    // Autowire other repository classes for your entities here

    @GetMapping("/query-form")
    public String showQueryBuilder(Model model) {
        QueryForm queryForm = new QueryForm();
        model.addAttribute("queryForm", queryForm);
        model.addAttribute("queryEntities", getQueryEntities());

        return "query-form";
    }

    @GetMapping("/query-builder/columns")
    @ResponseBody
    public List<String> getColumnsForEntity(@RequestParam("entityName") String entityName) {
        // Determine the selected entity and retrieve the corresponding repository
        JpaRepository<?, ?> repository = null;
        List<String> queryColumns = null;
        switch (entityName) {
            default:
            case "BH_Candidate":
                queryColumns = Arrays.stream(BH_Candidate.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;
            case "BH_Activity":
                queryColumns = Arrays.stream(BH_Activity.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;
            case "BH_ActivityCenterIgnore":
                queryColumns = Arrays.stream(BH_ActivityCenterIgnore.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;
            case "BH_AddressSource":
                queryColumns = Arrays.stream(BH_AddressSource.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;
            case "BhActivityGoalSnapShot":
                queryColumns = Arrays.stream(BH_ActivityGoalSnapshot.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;
            case "BH_AppointedHistory":
                queryColumns = Arrays.stream(BH_AppointedHistory.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;
            case "BH_AppointedHistoryFieldChange":
                queryColumns = Arrays.stream(BH_AppointedHistoryFieldChange.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;
            case "BH_BillableCharge":
                queryColumns = Arrays.stream(BH_BillableCharge.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;
            case "BH_BillableChargeEditHistory":
                queryColumns = Arrays.stream(BH_BillableChargeEditHistory.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;
            case "BH_CandidateHistory":
                queryColumns = Arrays.stream(BH_CandidateHistory.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;
            case "BH_CandidateSource":
                queryColumns = Arrays.stream(BH_CandidateSource.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;
            case "BH_Client":
                queryColumns = Arrays.stream(BH_Client.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;
            case "BH_ClientCorporation":
                queryColumns = Arrays.stream(BH_ClientCorporation.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;
            case "BH_ClientCorporationCustomObject":
                queryColumns = Arrays.stream(BH_ClientCorporationCustomObject.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;
            case "BH_ClientHistory":
                queryColumns = Arrays.stream(BH_ClientHistory.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;
            case "BH_Placement":
                queryColumns = Arrays.stream(BH_Placement.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;
            case "BH_PlacementChangeRequest":
                queryColumns = Arrays.stream(BH_PlacementChangeRequest.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;
            case "BH_PlacementChangeRequestEditHistory":
                queryColumns = Arrays.stream(BH_PlacementChangeRequestEditHistory.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;
            case "BH_User":
                queryColumns = Arrays.stream(BH_User.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;
            case "BH_UserContact":
                queryColumns = Arrays.stream(BH_UserContact.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;
            case "BH_UserEditHistory":
                queryColumns = Arrays.stream(BH_UserEditHistory.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;
            case "BH_BusinessSectorList":
                queryColumns = Arrays.stream(BH_BusinessSectorList.class.getDeclaredFields())
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
                break;

            // Add other cases for your entities here
        }
        // Retrieve the list of columns for the selected entity
        //List<String> queryColumns = getColumnNames(repository);

        return queryColumns;
    }


    @PostMapping("/query-builder")
    public String submitQueryBuilder(@ModelAttribute("queryForm") QueryForm queryForm, Model model) {
        // Determine the selected entity and retrieve the corresponding repository
        // Retrieve the list of columns for the selected entity
        System.out.println("Columns are:" +queryForm.getColumns());

        String queryString = buildQueryString(queryForm);


        // Add the query results to the model
        model.addAttribute("queryString", queryString);



        return "query-form";
    }

    // Helper method to get the list of entities for the entity dropdown
    private List<String> getQueryEntities() {
        // Add the names of your entities to this list
        List<String> entities = new ArrayList<>();
        entities.add("BH_CandidateHistory");
        entities.add("BH_CandidateSource");
        entities.add("BH_Client");
        entities.add("BH_ClientCorporation");
        entities.add("BH_ClientCorporationCustomObject");
        entities.add("BH_ClientHistory");
        entities.add("BH_Placement");
        entities.add("BH_PlacementChangeRequest");
        entities.add("BH_PlacementChangeRequestEditHistory");
        entities.add("BH_User");
        entities.add("BH_UserContact");
        entities.add("BH_UserEditHistory");
        entities.add("BH_BusinessSectorList");
        entities.add("BH_Candidate");
        entities.add("BH_Activity");
        entities.add("BH_ActivityCenterIgnore");
        entities.add("BhActivityGoalSnapShot");
        entities.add("BH_AddressSource");
        entities.add("BH_AppointedHistory");
        entities.add("BH_AppointedHistoryFieldChange");
        entities.add("BH_BillableCharge");
        entities.add("BH_BillableChargeEditHistory");
        // Add other entities here
        return entities;
    }

    // Helper method to get the list of column names for the selected entity
    private List<String> getColumnNames(JpaRepository<?, ?> repository) {
        Class<?> entityClass = repository.getClass();
        List<String> columnNames = new ArrayList<>();
         //Use reflection to get the list of fields in the entity class
        Field[] fields = entityClass.getDeclaredFields();
        for (Field field : fields) {
            // Ignore fields annotated with @Transient, as these are not columns in the database
            if (!field.isAnnotationPresent(Transient.class)) {
                columnNames.add(field.getName());
            }
        }

        return columnNames;
    }

    public List<String> getColumnNames(EntityManager entityManager, String entityName) throws ClassNotFoundException {
        Metamodel metamodel = entityManager.getMetamodel();
        Class<?> entityClass = Class.forName(entityName);
        EntityType<?> entityType = metamodel.entity(entityClass);
        List<String> columnNames = new ArrayList<>();
        for (Attribute<?, ?> attribute : entityType.getAttributes()) {
            columnNames.add(attribute.getName());
        }
        return columnNames;
    }

    private String buildQueryString(QueryForm queryForm) {
        StringBuilder queryStringBuilder = new StringBuilder();

        // Build the SELECT clause
        queryStringBuilder.append("SELECT ");

        if (queryForm.getColumns().isEmpty()) {
            queryStringBuilder.append("*");
        } else {
            queryStringBuilder.append(String.join(", ", queryForm.getColumns()));
        }

        // Build the FROM clause
        queryStringBuilder.append(" FROM ");
        queryStringBuilder.append(queryForm.getEntity());
        if(!queryForm.getJoin().startsWith("Nothing")){
            queryStringBuilder.append(" "+queryForm.getJoin());
        }

        // Build the WHERE clause
        if (!queryForm.getFilters().isEmpty()) {
            queryStringBuilder.append(" WHERE ");
            queryStringBuilder.append(String.join(" AND ", queryForm.getColumns()));
            if (!queryForm.getFilters().startsWith("NO")) {
                queryStringBuilder.append(" " + queryForm.getFilters());
            }
        }
        else{
            queryStringBuilder.append(" WHERE ");
            queryStringBuilder.append(String.join(" AND ", queryForm.getColumns()));
        }

        // Build the ORDER BY clause
        if (queryForm.getFilters().isEmpty()) {
            queryStringBuilder.append(" ORDER BY ");
        }

        return queryStringBuilder.toString();
    }


}

