package br.com.task_tracker_cli.models;

public enum TaskStatus {
  TODO("todo"),
  IN_PROGRESS("in-progress"),
  DONE("done");

  private final String value;

  TaskStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static TaskStatus fromValue(String value) {
    for (TaskStatus s : values()) {
      if (s.value.equals(value)) return s;
    }
    throw new IllegalArgumentException("Status inválido: " + value);
  }
}