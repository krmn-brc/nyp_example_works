#include <iostream>
#include <string>

using namespace std;



class Person
{
    protected:
        string name;
        string classRoom;
        int age;
    
    public :
        Person()
        {
            
        }
        Person(string name, string classRoom, int age)
        {
            this->name = name;
            this->classRoom = classRoom;
            this->age = age;
        }

        void setName(string value)
        {
            this->name = value;
        }
        string getName()
        {
            return this->name;
        }
        void setClassRoom(string value)
        {
            this->classRoom = value;
        }
        string getClassRoom()
        {
           return this->classRoom;
        }
        void setAge(int value)
        {
            this->age = value;
        }
        int getAge()
        {
           return this->age;
        }

        virtual string toString()
        {
            return  name + " - " + classRoom + " - " + std::to_string(age);
        }

};
