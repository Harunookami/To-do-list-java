package br.com.rafaelachagas.todolist.users;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity(name="tb_users")

public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column (unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDate createAt;

}
