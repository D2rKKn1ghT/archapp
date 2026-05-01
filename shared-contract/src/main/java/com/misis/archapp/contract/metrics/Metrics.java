package com.misis.archapp.contract.metrics;

public abstract class Metrics {

    // Counter метрика — сколько всего было создано пользователей
    public static final String USERS_CREATED_TOTAL = "users.new";

    // Summary метрика — длительность обработки запроса
    public static final String API_USER_REQ_DURATION = "api.user.request.duration";

    // Лейблы для метода HTTP
    public static final String METHOD_TAG = "method";
    public static final String POST_TAG_VAL = "post";
    public static final String GET_TAG_VAL = "get";
}