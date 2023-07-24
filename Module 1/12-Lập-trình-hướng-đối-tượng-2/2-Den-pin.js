class Battery{
    constructor(){
        this.energy = 0
    }
    setEnergy(energy){
        this.energy = energy
    }
    getEnergy(){
        return this.energy
    }
    decreaseEnergy(){
        if(this.energy > 0){
            this.energy--
        }
    }
}
class FlashLamp{
    constructor(){
        this.status = false
        this.battery = null
    }
    getBatteryInfo(){
        return this.battery.getEnergy()
    }
    setBattery(battery){
        this.battery = battery
    }
    turnOn(){
        if(this.getBatteryInfo() > 0){
            this.status = true
            this.battery.decreaseEnergy()
            this.light()
        }
        
    }
    turnOff(){
        this.status = false
        this.light()
    }
    light(){
        if(this.status == true){
            console.log("Đèn đỏ");
        }else{
            console.log("Đèn tắt");
        }
    }
}

let battery = new Battery()
battery.setEnergy(20)

let battery2 = new Battery()
battery2.setEnergy(10)

let flashLamp = new FlashLamp()
flashLamp.setBattery(battery)

console.log("Pin hiện tại", flashLamp.getBatteryInfo())
flashLamp.turnOn()
console.log("Pin sau khi bật", flashLamp.getBatteryInfo())
flashLamp.turnOn()
// flashLamp.turnOn()
console.log("Pin sau khi bật", flashLamp.getBatteryInfo())
// console.log(`Battery info ${flashLamp.getBatteryInfo}`);


// flashLamp.turnOn()
// console.log(flashLamp.status);
// console.log(flashLamp.light());

// flashLamp.turnOff()
// console.log(flashLamp.status);
// console.log(flashLamp.light());

