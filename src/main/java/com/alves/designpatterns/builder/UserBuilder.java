package com.alves.designpatterns.builder;

import com.alves.designpatterns.model.User;

public class UserBuilder {
    private Long id;
    private String name;
    private String email;

    private UserBuilder() {}

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public UserBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public UserBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public User build() {
        return new User(id, name, email);
    }
}
