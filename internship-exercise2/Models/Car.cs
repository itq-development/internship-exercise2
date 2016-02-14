using System.ComponentModel.DataAnnotations;

namespace internship_exercise2.Models
{
    public class Car
    {
        [Required(ErrorMessage = "Input valid fuel (in liters)")]
        [RegularExpression(@"\d+((,\d+)+)?(.\d+)?(.\d+)?(,\d+)?", ErrorMessage = "Input valid fuel (in liters)")]
        [Display(Name = "Fuel (in liters)")]
        public double Fuel { get; set; }

        [Required(ErrorMessage = "Input valid journey driven (in kilometers)")]
        [RegularExpression(@"\d+((,\d+)+)?(.\d+)?(.\d+)?(,\d+)?",
            ErrorMessage = "Input valid journey driven (in kilometers)")]
        [Display(Name = "Journey driven (in kilometers)")]
        public double JourneyDriven { get; set; }
    }
}