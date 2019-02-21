var moment = require('moment');
console.log(typeof (moment));

var currentTime = moment(new Date());
console.log(currentTime);

var date = currentTime.toDate();
console.log(date);