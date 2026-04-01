package br.com.task_tracker_cli.models;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "TSK_TASK")
public class Task {
  @Id
  @GeneratedValue( strategy = GenerationType.UUID )
  @Column(name = "TSK_ID")
  private String id;

  @Column(name = "TSK_DESCRIPTION", nullable = false, length = 255)
  private String description;

  @Column(name = "TSK_STATUS", nullable = false, length = 20)
  @Convert(converter = TaskStatusConverter.class)
  private TaskStatus status;
}
