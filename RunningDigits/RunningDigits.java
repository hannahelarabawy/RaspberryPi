//Code for the 4 Number, 7 Segment LED
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class RunningDigits {
final GpioController gpio;
final GpioPinDigitalOutput pin2, pin3, pin4, pin5, pin6, pin7, pin8,digit1, digit2, digit3, digit4;
public RunningDigits()
{
    gpio = GpioFactory.getInstance();
    pin2 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, "LED2", PinState.LOW);
    pin3 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_03, "LED3", PinState.LOW);
    pin4 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04, "LED4", PinState.LOW);
    pin5 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05, "LED5", PinState.LOW);
    pin6 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_06, "LED6", PinState.LOW);
    pin7 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07, "LED7", PinState.LOW);
    pin8 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_08, "LED8", PinState.LOW);
    digit1 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_13, "D1", PinState.LOW);
    digit2 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_12, "D2", PinState.LOW);
    digit3 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_11, "D3", PinState.LOW);
    digit4 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_10, "D4", PinState.LOW);
}

public void setNumber(int num)
{
if (num == 0)
{
pin2.high();
pin3.high();
pin4.high();
pin5.high();
pin6.high();
pin7.high();
pin8.low();
}
if (num == 1)
{
pin2.low();
pin3.high();
pin4.high();
pin5.low();
pin6.low();
pin7.low();
pin8.low();
}
if (num == 2)
{
pin2.high();
pin3.high();
pin4.low();
pin5.high();
pin6.high();
pin7.low();
pin8.high();
}
if (num == 3)
{
pin2.high();
pin3.high();
pin4.high();
pin5.high();
pin6.low();
pin7.low();
pin8.high();
}
if (num == 4)
{
pin2.low();
pin3.high();
pin4.high();
pin5.low();
pin6.low();
pin7.high();
pin8.high();
}
if (num == 5)
{
pin2.high();
pin3.low();
pin4.high();
pin5.high();
pin6.low();
pin7.high();
pin8.high();
}
if (num == 6)
{
pin2.high();
pin3.low();
pin4.high();
pin5.high();
pin6.high();
pin7.high();
pin8.high();
}
if (num == 7)
{
pin2.high();
pin3.high();
pin4.high();
pin5.low();
pin6.low();
pin7.low();
pin8.low();
}
if (num == 8)
{
pin2.high();
pin3.high();
pin4.high();
pin5.high();
pin6.high();
pin7.high();
pin8.high();
}
if (num == 9)
{
pin2.high();
pin3.high();
pin4.high();
pin5.high();
pin6.low();
pin7.high();
pin8.high();
}
}
public void clear()
{
pin2.low();
pin3.low();
pin4.low();
pin5.low();
pin6.low();
pin7.low();
pin8.low();
}

public void chooseNum(int num)
{
if (num == 1)
{
digit1.high();
digit2.low();
digit3.low();
digit4.low();
}
if (num == 2)
{
digit1.low();
digit2.high();
digit3.low();
digit4.low();
}
if (num == 3)
{
digit1.low();
digit2.low();
digit3.high();
digit4.low();
}
if (num == 4)
{
digit1.low();
digit2.low();
digit3.low();
digit4.high();
}
}
public void shutdown()
{
gpio.shutdown();
}
}
