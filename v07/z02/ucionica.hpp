#ifndef UCIONICA_HPP_INCLUDED
#define UCIONICA_HPP_INCLUDED
#include "list.hpp"
#include "osoba.hpp"


class Ucionica{
public:
    Ucionica(int br, const DinString& ziv) : maxBr(br), naziv(ziv){}

    bool dodajNovu(const Osoba& o){
        if(osobe.size() < maxBr){
            osobe.add(osobe.size()+1, o);
            return true;
        }
        return false;
    }

    void ispis(){
        std::cout<<"Osobe prisutne:" << std::endl;
        int i;
        Osoba temp;
        for(i = 0; i < osobe.size(); i ++){
            if(osobe.read(i + 1, temp))
            temp.ispis();
            else
                std::cout << "NEUSPELI ISPIS";
        }
    }

private:
    DinString naziv;
    int maxBr;
    List<Osoba> osobe;
};


#endif // UCIONICA_HPP_INCLUDED
