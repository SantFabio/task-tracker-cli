package br.com.task_tracker_cli.utils;

import java.util.HashMap;
import java.util.Map;

import io.github.cdimascio.dotenv.Dotenv;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
  private static EntityManagerFactory ENTITY_MANAGER_FACTORY = null;

  public static EntityManager getEntityManager() {
    if (ENTITY_MANAGER_FACTORY == null) {
      // Carrega o arquivo .env; ignoreIfMissing() ajuda a não quebrar se o arquivo não for encontrado no futuro
      Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();

      // Constrói a URL do JDBC incluindo o banco de dados (PGDATABASE)
      String jdbcUrl = "jdbc:postgresql://" + dotenv.get("PGHOST") + "/" + dotenv.get("PGDATABASE") + "?sslmode=" + dotenv.get("PGSSLMODE");

      Map<String, String> props = new HashMap<>();
      props.put("javax.persistence.jdbc.url", jdbcUrl);
      props.put("javax.persistence.jdbc.user", dotenv.get("PGUSER"));
      props.put("javax.persistence.jdbc.password", dotenv.get("PGPASSWORD"));
      props.put("javax.persistence.jdbc.driver", "org.postgresql.Driver");

      ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("task-tracker-cli", props);
    }
    return ENTITY_MANAGER_FACTORY.createEntityManager();
  }
}
