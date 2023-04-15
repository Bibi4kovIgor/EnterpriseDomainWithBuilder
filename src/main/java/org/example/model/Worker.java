package org.example.model;

import java.time.Instant;

public class Worker {

    private String firstName;
    private String lastName;
    private String identity;
    private Position position;
    private Department department;
    private String phone;
    private Instant birthdayDate;
    private Instant startWorkDate;
    private String account;

    public Worker() {

    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", identity='" + identity + '\'' +
                ", position=" + position +
                ", department=" + department +
                ", phone='" + phone + '\'' +
                ", birthdayDate=" + birthdayDate +
                ", startWorkDate=" + startWorkDate +
                ", account='" + account + '\'' +
                '}';
    }

    public static WorkerBuilder builder(){
        return new WorkerBuilder();
    }


    public static final class WorkerBuilder {
        Worker worker;

        public WorkerBuilder() {
            this.worker = new Worker();
        }

        public WorkerBuilder firstName(String firstName) {
            worker.firstName = firstName;
            return this;
        }

        public WorkerBuilder lastName(String lastName) {
            worker.lastName = lastName;
            return this;
        }

        public WorkerBuilder identity(String identity) {
            worker.identity = identity;
            return this;
        }

        public WorkerBuilder position(Position position) {
            worker.position = position;
            return this;
        }

        public WorkerBuilder department(Department department) {
            worker.department = department;
            return this;
        }

        public WorkerBuilder phone(String phone) {
            worker.phone = phone;
            return this;
        }

        public WorkerBuilder birthdayDate(Instant birthdayDate) {
            worker.birthdayDate = birthdayDate;
            return this;
        }

        public WorkerBuilder startWorkDate(Instant startWorkDate) {
            worker.startWorkDate = startWorkDate;
            return this;
        }

        public WorkerBuilder account(String account) {
            worker.account = account;
            return this;
        }

        public Worker build() {
            return worker;
        }
    }
}
