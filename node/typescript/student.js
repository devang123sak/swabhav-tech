"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Student = /** @class */ (function () {
    function Student(firstName, lastName, cgpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cgpa = cgpa;
    }
    Object.defineProperty(Student.prototype, "details", {
        get: function () {
            return "Student First Name " + this.firstName + "\n        Student Last Name " + this.lastName + "\n        Student Cgpa " + this.cgpa;
        },
        enumerable: true,
        configurable: true
    });
    return Student;
}());
exports.Student = Student;
/*
let s1=new Student("raj","shinde",3000);
console.log(s1.details);*/ 
