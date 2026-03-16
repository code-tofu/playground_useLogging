curl --location 'http://localhost:6611/log-level' \
--header 'traceparent: 00-4bf92f3577b34da6a3ce929d0e0e4736-00f067aa0ba902b7-01'

curl --location 'http://localhost:6611/log-info?param=postman' \
--header 'traceparent: 00-4bf92f3577b34da6a3ce929d0e0e4736-00f067aa0ba902b7-01'

curl --location 'http://localhost:6611/log-masking' \
--header 'traceparent: 00-4bf92f3577b34da6a3ce929d0e0e4736-00f067aa0ba902b7-01'