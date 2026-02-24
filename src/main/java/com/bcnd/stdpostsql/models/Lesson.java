package com.bcnd.stdpostsql.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Table(name = "lesson")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lessonId;

    @Column(name = "topic")
    private String topic;

    @Column(name = "duration")
    private Integer duration;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
