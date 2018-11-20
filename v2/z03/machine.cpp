#include "machine.hpp"

Machine::Machine(){
    currentState = sC;
    value = 80;
}

bool Machine::metodaX(){
    if(currentState == sC || currentState == sB){
        currentState = sA;
        plus();
        minus();
        return true;
    }
    return false;
}

bool Machine::metodaY(){
    if(currentState == sB || currentState == sD){
        currentState = sC;
        value = 80;
        return true;
    }
    return false;
}

bool Machine::metodaZ(){
    if(currentState == sA){
        currentState = sB;
        value = 0;
        return true;
    }
    return false;
}

bool Machine::metodaW(){
    if(currentState == sA){
        currentState = sD;
        value = 0;
        return true;
    }
    return false;
}

bool Machine::plus(){
    if(value + STEP <= MAX_VAL){
        value += STEP;
        return true;
    }
    return false;
}

bool Machine::minus(){
    if(value - STEP >= MAX_VAL){
        value -= STEP;
        return true;
    }
    return false;
}

MachineState Machine::getCurrentState()const{
    return currentState;
}

int Machine::getValue() const{
    return value;
}
