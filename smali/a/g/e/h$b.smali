.class La/g/e/h$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/g/e/h$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/g/e/h;->a(La/g/d/c/c$b;I)La/g/d/c/c$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La/g/e/h$c<",
        "La/g/d/c/c$c;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(La/g/e/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/g/d/c/c$c;)I
    .locals 0

    invoke-virtual {p1}, La/g/d/c/c$c;->e()I

    move-result p1

    return p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, La/g/d/c/c$c;

    invoke-virtual {p0, p1}, La/g/e/h$b;->a(La/g/d/c/c$c;)I

    move-result p1

    return p1
.end method

.method public b(La/g/d/c/c$c;)Z
    .locals 0

    invoke-virtual {p1}, La/g/d/c/c$c;->f()Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, La/g/d/c/c$c;

    invoke-virtual {p0, p1}, La/g/e/h$b;->b(La/g/d/c/c$c;)Z

    move-result p1

    return p1
.end method
