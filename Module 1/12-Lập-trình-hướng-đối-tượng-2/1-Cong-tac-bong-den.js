class ElectricLamp{
    constructor(status){
        this.status = status;
    }
    getStatus(){
        return this.status;
    }
}
class SwitchButton{
    constructor(nameOfLamp,status){
        this.nameOfLamp = nameOfLamp;
        this.status = status
    }
    connectToLamp(ElectricLamp){
        this.nameOfLamp = ElectricLamp
    }
    getLamp(){
        return this.nameOfLamp
    }
    setLamp(nameOfLamp) {
        this.nameOfLamp = nameOfLamp;
    }
    getSwitchOn(){
        this.nameOfLamp.status = true
        return this.status = true
    }
    getSwtichOff(){
        this.nameOfLamp.status = false
        return this.status = false
    }


}

let den1 = new ElectricLamp(false)
let den2 = new ElectricLamp(false)
let nut1 = new SwitchButton(den1,false)

console.log(den1);
console.log(nut1.getLamp());
console.log(nut1.getSwitchOn());
console.log(den1);

nut1.setLamp(den2)
console.log(nut1.getLamp().getStatus());
