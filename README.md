# CareAxis Hospital Management System

Premium Spring Boot 3 / Java 21 hospital operations foundation, including a public hospital website, secured staff portal, dashboard, patient directory, appointment scheduling, and bed tracking.

## Run

1. Install JDK 21+ and Maven 3.9+.
2. Run `mvn spring-boot:run`.
3. Open `http://localhost:8080`.

The application starts with an embedded H2 database for immediate evaluation. Set `DB_URL`, `DB_USERNAME`, and `DB_PASSWORD` to connect MySQL (e.g. `jdbc:mysql://localhost:3306/careaxis`). The supplied staff account is seeded securely through BCrypt at startup; do not expose it on the public site.
