interface ICustomer {
    firstName: String,
    lastName: String,
    salary: number
}

printDetails([{ firstName: "devang", lastName: "sakpal", salary: 2000 }, { firstName: "raj", lastName: "shinde", salary: 3000 }])

function printDetails(Customer: ICustomer[]) {
    for (let c in Customer) {
        console.log(c);
    }
}