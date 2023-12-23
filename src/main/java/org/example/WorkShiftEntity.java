package org.example;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table
@Data
public class WorkShiftEntity extends BaseEntity {
    @Column(name = "start_date")
    private LocalDateTime startDate;
    @Column(name = "continuity")
    private LocalDateTime continuity;
    @Column(name = "queue")
    private Integer queue;
    @ManyToOne
    @JoinColumn(name = "transport_id")
    private TransportEntity transportEntity;
}
