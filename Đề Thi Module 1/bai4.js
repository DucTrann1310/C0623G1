class Animal {
    constructor(name, weight) {
        this.name = name;
        this.weight = weight;
    }
    setName(name) {
        this.name = name;
    }
    getName() {
        return this.name;
    }
    setWeight(weight) {
        this.weight = weight;
    }
    toString() {
        return `${this.name} ${this.weight}`;
    }
}

let objAnimal1 = new Animal("Elephant",45.6);
console.log(objAnimal1.toString());
objAnimal1.name = "Elephant";
objAnimal1.weight = 45.6;
console.log(objAnimal1.toString());


let objAnimal2 = new Animal;
objAnimal2.name = "Cat";
objAnimal2.weight = 20;
console.log(objAnimal2.toString());
objAnimal2.setName("Mouse");
console.log(objAnimal2.toString());