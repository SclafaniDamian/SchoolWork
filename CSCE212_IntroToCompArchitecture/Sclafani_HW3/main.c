//main.c

#include "gba.h"

void sync()
{
  while(REG_DISPLAY_VCOUNT >= 160);
  while(REG_DISPLAY_VCOUNT < 160);
}

void draw_rect(struct Rect r, uint16 color)
{
  for(int i = 0; i < r.h; i++)
  {
    for(int j = 0; j < r.w; j++)
    {
      SCREENBUFFER[SCREEN_WIDTH * (i + r.y) + (j + r.x)] = color;
    }
  }
}

void init7seg()
{
  a.w = 16;
  a.h = 4;
  f.w = 4;
  f.h = 16;
  
  b = c = e = f;
  d = g = a;
  
  a.x = d.x = e.x = f.x = g.x = SCREEN_WIDTH/2;
  b.x = c.x = a.x + a.w;
  
  a.y = b.y = f.y = 0;
  c.y = e.y = g.y = b.y + b.h - a.h;
  d.y = g.y + b.h - a.h;
}

void clear7seg()
{
    draw_rect(a, 0x0000);
    draw_rect(b, 0x0000);
    draw_rect(c, 0x0000);
    draw_rect(d, 0x0000);
    draw_rect(e, 0x0000);
    draw_rect(f, 0x0000);
    draw_rect(g, 0x0000);
}

void draw7seg(uint8 num)
{
    clear7seg();
  
    uint8 w, x, y, z;
    
    w = num & 8;
    x = num & 4;
    y = num & 2;
    z = num & 1;
    
    if(y || w || (x && z) || (!x && !z)) {  // a
      draw_rect(a, 0x001f);
    }
    if(!x || (!y && !z) || (y && z)) {  // b
      draw_rect(b, 0x001f);
    }
    if (w || x || !y || z) {  // c
      draw_rect(c, 0x001f);
    }
    if ((!x && !z) || (y && !z) || (x && !y && z) || (!x && y)) { // d
      draw_rect(d, 0x001f);
    }
    if ((!x && !z) || (y && z)) { // e
      draw_rect(e, 0x001f);
    }
    if (w || (!y && !z) || (x && !z) || (x && !y)) {  // f
      draw_rect(f, 0x001f);
    }
    if (w || (y && !z) || (x && !y) || (!x && y)) { // g
      draw_rect(g, 0x001f);
    }
}

int main()
{
  REG_DISPLAY = VIDEOMODE | BGMODE;
  
  init7seg();
  
  uint8 counter = 0;
  uint8 down = 0;
  
  /*ball.x = 120;
  ball.y = 80;
  ball.w = 8;
  ball.h = 8;
  
  player.x = 0;
  player.y = 0;
  player.w = 8;
  player.h = 32;
  
  player2.w = 8;
  player2.h = 32;
  player2.x = SCREEN_WIDTH - player2.w;
  player2.y = 0;
  
  prevBall = ball;
  prevPlayer = player;
  prevPlayer2 = player2;*/
  
  int speedX = 1;
  int speedY = 1;
  
  while(1)
  {
    sync();
    /*draw_rect(prevBall, 0x0000);
    draw_rect(prevPlayer, 0x0000);
    draw_rect(prevPlayer2, 0x0000);*/
    
    if(!(REG_DISPLAY_INPUT & A) && !down)
    {
      counter++;
      if(counter > 9)
        counter = 0;
      down = 1;
    }
    else if((REG_DISPLAY_INPUT & A))
    {
      down = 0;
    }
    
    /*ball.x += speedX;
    ball.y += speedY;
    
    if(ball.y >= SCREEN_HEIGHT - ball.h || ball.y <= 0)
      speedY = -speedY;
    if(ball.x >= SCREEN_WIDTH - ball.w || ball.x <= 0)
      speedX = -speedX;*/
    
    /*if(!(REG_DISPLAY_INPUT & DOWN) && player.y < SCREEN_HEIGHT - player.h)
    {
      player.y += 1;
    }
    if(!(REG_DISPLAY_INPUT & UP) && player.y > 0)
    {
      player.y -= 1;
    }
    if(!(REG_DISPLAY_INPUT & L) && player2.y < SCREEN_HEIGHT - player2.h)
    {
      player2.y += 1;
    }
    if(!(REG_DISPLAY_INPUT & R) && player2.y > 0)
    {
      player2.y -= 1;
    }*/
    
    draw7seg(counter);
    /*draw_rect(ball, 0x1111);
    draw_rect(player, 0x1e00);
    draw_rect(player2, 0x1e00);
    
    prevBall = ball;
    prevPlayer = player;
    prevPlayer2 = player2;
    
    if(ball.x <= 0)
    {
      ball.x = 130;
      ball.y = 80;
    }
    
    if(ball.x + ball.h >= SCREEN_WIDTH)
    {
      ball.x = 130;
      ball.y = 80;
    }
    
    if(ball.x == player.x + player.w)
    {
      if(ball.y <= player.y + player.h && ball.y + ball.h >= player.y)
        speedX = -speedX;
    }
    
    if(ball.x + ball.w == player2.x)
    {
      if(ball.y <= player2.y + player2.h && ball.y + ball.h >= player2.y)
        speedX = -speedX;
    }*/
  }
}







