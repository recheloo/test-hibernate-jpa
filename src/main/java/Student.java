import lombok.Data;
import javax.persistence.*;

/**
 * Created by lzx on 2019/10/24.
 */
@Data
@Entity
@Table(name = "tb_student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stu_id")
    private long stuId;
    @Column(name="stu_name")
    private String stuName;
    @Column(name="stu_age")
    private Integer stuAge;
    @Column(name="stu_password")
    private String stuPassword;

}
