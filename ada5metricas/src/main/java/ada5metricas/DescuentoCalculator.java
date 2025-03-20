package ada5metricas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


 public class DescuentoCalculator { 
    public static String calcularDescuento(double precio, String categoria) { 
        if (precio <= 0) { 
            return "Error: Precio inválido"; 
        } 
 
        double descuento; 
        switch (categoria) { 
            case "A": 
                descuento = 0.10; // 10% de descuento 
                break; 
            case "B": 
                descuento = 0.15; // 15% de descuento 
                break; 
            case "C": 
                descuento = 0.20; // 20% de descuento 
                break; 
            default: 
                return "Error: Categoría inválida"; 
        } 
 
        double precioFinal = precio - (precio * descuento); 
        return String.valueOf(Math.round(precioFinal * 100.0) / 100.0); 
    } 
} 