using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RockPaperScissorsGame
{
    public class RandomComputerPlayer:ComputerPlayer
    {
        
        public override void PcMove()
        {
            ComputerName = "RandomPC";
            Random rnd = new Random();
            int n = rnd.Next(3);
            SelectMove =  _selects[n];
        }
    }
}