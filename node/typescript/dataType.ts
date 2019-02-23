let userName: String = "devang";
let userCompanyName: String = "aurionpro";
let userAge: number = 25;
let isMale: boolean = true;
let userLocation: String = "mumbai";

const details = `emplyoee name ${userName}
Company name ${userCompanyName}
emplyoee age ${userAge}
emplyoee is Male ${isMale}
emplyoee location ${userLocation}
`

displayUser(details);

function displayUser(data: String): void {
    console.log(data);
}
