printDetails([{ firstName: "devang", lastName: "sakpal", salary: 2000 }, { firstName: "raj", lastName: "shinde", salary: 3000 }]);
function printDetails(Customer) {
    for (var c in Customer) {
        console.log(c);
    }
}
