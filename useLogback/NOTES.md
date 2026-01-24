- prudent=true not necessary for file appender, log back will auto create.
- note no / at start of directory
- LOG_DIR_IS_UNDEFINED will be created 
- Logback (1.5.13+) removed JaninoEventEvaluator due to security risks or moved it to separate modules
https://logback.qos.ch/manual/layouts.html#conversionWord

management.tracing.sampling.probability=1.0 
Default sampling is 0.1 (10%). Set to 1.0 (100%) for development/testing to see all traces.

https://signoz.io/comparisons/opentelemetry-vs-brave/

https://micrometer.io/docs/tracing
https://spring.io/blog/2022/10/12/observability-with-spring-boot-3

https://spring.io/blog/2024/10/28/lets-use-opentelemetry-with-spring

https://medium.com/@warunaudarasampath/how-to-build-a-custom-logger-with-trace-id-in-spring-boot-a-step-by-step-guide-6c744b22ef9f