.class La/g/e/h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/g/e/h$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/g/e/h;->a([La/g/i/b$f;I)La/g/i/b$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La/g/e/h$c<",
        "La/g/i/b$f;",
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
.method public a(La/g/i/b$f;)I
    .locals 0

    invoke-virtual {p1}, La/g/i/b$f;->d()I

    move-result p1

    return p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, La/g/i/b$f;

    invoke-virtual {p0, p1}, La/g/e/h$a;->a(La/g/i/b$f;)I

    move-result p1

    return p1
.end method

.method public b(La/g/i/b$f;)Z
    .locals 0

    invoke-virtual {p1}, La/g/i/b$f;->e()Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, La/g/i/b$f;

    invoke-virtual {p0, p1}, La/g/e/h$a;->b(La/g/i/b$f;)Z

    move-result p1

    return p1
.end method
