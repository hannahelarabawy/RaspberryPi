//Code for the 4 Number, 7 Segment LED
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class RunningDigits {
final GpioController gpio;
final GpioPinDigitalOutput a, b, c, d, e, f, g,digit1, digit2, digit3, digit4;
public RunningDigits()
{
    gpio = GpioFactory.getInstance();
    a = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04, "a", PinState.LOW);
    b = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "b", PinState.LOW);
    c = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_03, "c", PinState.LOW);
    d = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07, "d", PinState.LOW);
    e = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05, "e", PinState.LOW);
    f = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_06, "f", PinState.LOW);
    g = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, "g", PinState.LOW);
    digit1 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_13, "D1", PinState.LOW);
    digit2 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_12, "D2", PinState.LOW);
    digit3 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_11, "D3", PinState.LOW);
    digit4 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_10, "D4", PinState.LOW);
}

public void setNumber(int num)
{
if (num == 0)
{
a.high();
b.high();
c.high();
d.high();
e.high();
f.high();
g.low();
}
if (num == 1)
{
a.low();
b.high();
c.high();
d.low();
e.low();
f.low();
g.low();
}
if (num == 2)
{
a.high();
b.high();
c.low();
d.high();
e.high();
f.low();
g.high();
}
if (num == 3)
{
a.high();
b.high();
c.high();
d.high();
e.low();
f.low();
g.high();
}
if (num == 4)
{
a.low();
b.high();
c.high();
d.low();
e.low();
f.high();
g.high();
}
if (num == 5)
{
a.high();
b.low();
c.high();
d.high();
e.low();
f.high();
g.high();
}
if (num == 6)
{
a.high();
b.low();
c.high();
d.high();
e.high();
f.high();
g.high();
}
if (num == 7)
{
a.high();
b.high();
c.high();
d.low();
e.low();
f.low();
g.low();
}
if (num == 8)
{
a.high();
b.high();
c.high();
d.high();
e.high();
f.high();
g.high();
}
if (num == 9)
{
a.high();
b.high();
c.high();
d.high();
e.low();
f.high();
g.high();
}
}
public void clear()
{
a.low();
b.low();
c.low();
d.low();
e.low();
f.low();
g.low();
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
