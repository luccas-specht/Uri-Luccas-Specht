var input = require('fs').readFileSync('test case', 'utf8');

var values = input.split('\n');

const [x1, y1] = values[0].split(' ');
const [x2, y2] = values[1].split(' ');

const returnDistance = () => console.log(Math.sqrt(((x2-x1) ** 2) + (y2 - y1) ** 2));

returnDistance()

