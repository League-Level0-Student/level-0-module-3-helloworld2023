int x1=100;
int x2=400;
void setup(){
size(500,500);
}
void draw(){
  background(216,214,214);
  noFill();
for(int i=0;i<10;i++){
  ellipse(x1,250,i*15,i*15);
}
  for(int i=0;i<10;i++){
  ellipse(x2,250,i*15,i*15);
  }
x1=x1+1;
x2=x2-1;
if(x1==400){
  x1=100;
}
if(x2==100){
  x2=400;
}
}