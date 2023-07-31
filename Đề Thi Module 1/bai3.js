function negativeInteger(string) {
    let count = 0;
    let array = string.split("");
    let check = "aeiou";
    for (let i = 0; i < array.length; i++) {
        if (check.includes(array[i])) {
            count++;
        }
    }
    if (count == 0) {
        return false;
    } else {
        return count;
    }
}
let str = "Hello World";
console.log(negativeInteger(str));