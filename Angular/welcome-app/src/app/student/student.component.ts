import { Component } from '@angular/core';
import { IStudent } from './IStudent';

@Component({
    selector: 'sw-student',
    templateUrl: './student.component.html',
})
export class studentComponent {
    private student: IStudent;
    private message: String = "This is property From Student Component";
    private imageUrl: String = "../../assets/profile.png";
    private courses: [];

    constructor() {
        this.student = { cgpa: 5.5, name: "raj", job: "dev", company: "google" };
    }

    get cgpabackgroundColor() {
        if (this.student.cgpa < 7) {
            return "red";
        } else {
            return "green";
        }
    }

    public LoadCourse() {
        //alert("hi");
        console.log("click");
        this.courses = ["html","css"];

    }

}