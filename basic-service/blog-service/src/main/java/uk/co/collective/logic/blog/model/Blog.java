package uk.co.collective.logic.blog.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by graeme.dougal on 16/04/2018.
 */
@Getter
@Setter
public class Blog {

    private String id;
    private String title;
    private Date createdOn;
    private String createdBy;
}
