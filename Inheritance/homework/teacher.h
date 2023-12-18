#include <iostream>
#include <string>
#include <list>
using namespace std;



class Teacher:public Person
{
    private:
        list<string> branches;

    public :
        Teacher():Person()
        {
            
        }
        Teacher(list<string> branches, string name, string classRoom, int age):
        Person(name, classRoom, age)
        {
            this->branches = branches;
        }
        void setBranches(string branch)
        {
            this->branches.push_back(branch);
        }
        list<string> getBranches()
        {
            return this->branches;
        }

        string toString() override
        {
            string brn = "";
         for (auto &&b : branches)
         {
             brn += b + ", ";
         }
         
         return "Öğretmenin: \n"+ name +  " - " + std::to_string(age) + " - " + brn.substr(0, brn.length() -2);
        }
};