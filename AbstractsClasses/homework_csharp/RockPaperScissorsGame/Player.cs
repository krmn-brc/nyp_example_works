using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RockPaperScissorsGame
{
    public abstract class Player
    {
        protected List<string> _selects = new(){"rock", "paper", "scissors" };
        public string? GamingName { get; set; }
        public int Point { get; set; } = 0;
        public string? SelectMove { get; set; }

        public void UserWelcome()
        {
            Console.Write($"Hoşgeldiniz 😊\nAdınızı giriniz: ");
            GamingName = Console.ReadLine();
            GamingName = GamingName?.Substring(0, 1).ToUpper() + GamingName?.Substring(1);
            Console.WriteLine($"Merhaba {GamingName} Hazırsan bir tuşa bas ve oyuna başlayalım.");
            Console.Read();
        }
        
        public virtual void UserMove()
        {
             
        }
    }
}