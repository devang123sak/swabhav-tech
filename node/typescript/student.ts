export class Student {

    constructor(private firstName, private lastName, private cgpa) {

    }

  public  get details() {
        return `Student First Name ${this.firstName}
        Student Last Name ${this.lastName}
        Student Cgpa ${this.cgpa}`
    }
}

/*
let s1=new Student("raj","shinde",3000);
console.log(s1.details);*/