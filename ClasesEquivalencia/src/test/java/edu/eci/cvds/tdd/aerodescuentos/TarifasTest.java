package edu.eci.cvds.tdd.aerodescuentos;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest { 

    @Test
    public void pruebaEdadNegativa() {
        
        try{
            double res = CalculadorDescuentos.calculoTarifa(500,6,-5);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaDescuentoPorEdad() {
        
        
        double res = CalculadorDescuentos.calculoTarifa(500,6,10);
        double correct = 475;
        
        Assert.assertEquals(res,correct,0.0f);
        
    }
    @Test
    public void pruebaDescuentoPorEdad2() {
        
        
        double res = CalculadorDescuentos.calculoTarifa(500,6,25);
        double correct =500;
        
        Assert.assertEquals(res,correct,0.0f);
        
        
    }
    @Test
    public void pruebaDescuentoPorEdadAdultoMayor() {
        
        
        double res = CalculadorDescuentos.calculoTarifa(500,6,80);
        double correct =460;
        
        Assert.assertEquals(res,correct,0.0f);
        
        
    }
    @Test
    public void pruebaEdadExagerada() {
        
        try{
            double res = CalculadorDescuentos.calculoTarifa(500,6,200);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaTarifaNegativa() {
        
        try{
            double res = CalculadorDescuentos.calculoTarifa(-300,6,25);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaTarifaSinDescuento() {

        double res = CalculadorDescuentos.calculoTarifa(400,6,25);
        double correct = 400;
        
        Assert.assertEquals(correct, res, 0.0f);
    }

    @Test
    public void pruebaDiasAntelacionNegativos() {
        
        try{
            double res = CalculadorDescuentos.calculoTarifa(400,-6,25);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaDiasDeAntelacionSinDescuento() {
        
        
        double res = CalculadorDescuentos.calculoTarifa(400,6,25);
        double correct =400;
        
        Assert.assertEquals(res,correct,0.0f);
        
        
    }
    @Test
    public void pruebaDiasAntelacionConDescuento() {
        
        
        double res = CalculadorDescuentos.calculoTarifa(400,22,25);
        double correct =340;
        
        Assert.assertEquals(res,correct,0.0f);
        
        
    }
    @Test
    public void pruebaDiasAntelacionSuperaRango() {
        
        try{
            double res = CalculadorDescuentos.calculoTarifa(400,100000,25);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaFronteraEdad() {
        
        try{
            double res = CalculadorDescuentos.calculoTarifa(500,6,-1);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaFronteraEdad2() {
        
        double res = CalculadorDescuentos.calculoTarifa(500,6,0);
        double correct =475;
        
        Assert.assertEquals(res,correct,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad3() {
        
        double res = CalculadorDescuentos.calculoTarifa(500,6,1);
        double correct =475;
        
        Assert.assertEquals(res,correct,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad4() {
        
        double res = CalculadorDescuentos.calculoTarifa(500,6,17);
        double correct =475;
        
        Assert.assertEquals(res,correct,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad5() {
        
        double res = CalculadorDescuentos.calculoTarifa(500,6,18);
        double correct =500;
        
        Assert.assertEquals(res,correct,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad6() {
        
        double res = CalculadorDescuentos.calculoTarifa(500,6,19);
        double correct =500;
        
        Assert.assertEquals(res,correct,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad7() {
        
        double res = CalculadorDescuentos.calculoTarifa(500,6,64);
        double correct =500;
        
        Assert.assertEquals(res,correct,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad8() {
        
        double res = CalculadorDescuentos.calculoTarifa(500,6,65);
        double correct =500;
        
        Assert.assertEquals(res,correct,0.0f);
        
    }
    @Test
    public void pruebaFronteraEdad9() {
        
        double res = CalculadorDescuentos.calculoTarifa(500,6,66);
        double correct =460;
        
        Assert.assertEquals(res,correct,0.0f);
        
    }
    @Test
    public void pruebaDescuentoPorEdadFronteraInferior() {
        
        double res = CalculadorDescuentos.calculoTarifa(500,6,124);
        double correct =460;
        
        Assert.assertEquals(res,correct,0.0f);
        
    }
    @Test
    public void pruebaDescuentoPorEdadLimite() {
        
        double res = CalculadorDescuentos.calculoTarifa(500,6,125);
        double correct =460;
        
        Assert.assertEquals(res,correct,0.0f);
        
    }
    @Test
    public void pruebaDescuentoPorEdadFronteraSuperior() {
        
        try{
            double res = CalculadorDescuentos.calculoTarifa(500,6,126);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaTarifaNegativaFronteraInferior() {
        
        try{
            double res = CalculadorDescuentos.calculoTarifa(-1,6,25);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaFronteraNegativaLimite() {
        
        double res = CalculadorDescuentos.calculoTarifa(0,6,25);
        double correct =0;
        
        Assert.assertEquals(res,correct,0.0f);
        
    }
    @Test
    public void pruebaTarifaNegativaFronteraSuperior() {
        
        try{
            double res = CalculadorDescuentos.calculoTarifa(500,-1,25);
        }catch(Exception e){
            Assert.assertTrue(true);
        }
        
    }
    @Test
    public void pruebaFronteraDiasAntelacion() {
        
        double res = CalculadorDescuentos.calculoTarifa(500,0,25);
        double correct =500;
        
        Assert.assertEquals(res,correct,0.0f);
        
    }
    @Test
    public void pruebaFronteraSuperiorDiasAntelacion() {
        
        double res = CalculadorDescuentos.calculoTarifa(500,1,25);
        double correct =500;
        
        Assert.assertEquals(res,correct,0.0f);
        
    }
    @Test
    public void pruebaFronteraDiasAntelacion4() {
        
        double res = CalculadorDescuentos.calculoTarifa(500,21,25);
        double correct = 500;
        
        Assert.assertEquals(res,correct,0.0f);
        
    }
    @Test
    public void pruebaFronteraDiasAntelacion5() {
        
        double res = CalculadorDescuentos.calculoTarifa(500,20,25);
        double correct =500;
        Assert.assertEquals(res,correct,0.0f);
        
    }
    @Test
    public void pruebaDescuentoPorDiasAntelacion() {
        
        double res = CalculadorDescuentos.calculoTarifa(500,23,25);
        double correct =425;
        Assert.assertEquals(res,correct,0.0f);
        
    }
}
