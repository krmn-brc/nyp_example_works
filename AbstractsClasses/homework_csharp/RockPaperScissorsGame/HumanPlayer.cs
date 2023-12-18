using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RockPaperScissorsGame
{
    public class HumanPlayer:Player
    {
        
        public override void UserMove()
        {
            Console.Clear();
            
            Console.WriteLine($"1- Taş\n2- Kağıt\n3- Makas");
            Console.Write("Lütfen Hamlenizi Seçiniz: ");
            string? chr = Console.ReadLine();
            bool selection = SelectionControl(chr);
            while (!selection)
            {
                chr = Console.ReadLine();
                selection = SelectionControl(chr);
            }
            int n = int.Parse(chr);
            string selectMove = _selects[n-1];
            SelectMove =  selectMove;
        }

        private bool SelectionControl(string chr)
        {
            int n = 0;
            if(String.IsNullOrEmpty(chr))
            {
                Console.WriteLine("Lütfen bir seçim yapınız");
                return false;
            }
            else
            {
                if(char.IsDigit(chr, 0))
                {
                    n = int.Parse(chr);
                    if((n>=1 && n<=3))
                    {
                        return true;
                    }
                    Console.WriteLine("Geçerli bir seçim yapınız");
                    return false;
                }
                Console.WriteLine("Sayısal bir değer giriniz.");
                return false;
            }
        }
        
      }
}