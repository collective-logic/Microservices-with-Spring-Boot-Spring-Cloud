package uk.co.collective.logic.blog.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by graeme.dougal on 16/04/2018.
 */
@Getter
@Setter
@Entity
public class Blog {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    private String title;

    @CreatedDate
    private Date createdOn;

    @CreatedBy
    private String createdBy;
}
