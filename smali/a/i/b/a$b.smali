.class final La/i/b/a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/i/b/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/i/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La/i/b/b$b<",
        "La/e/h<",
        "La/g/l/d0/c;",
        ">;",
        "La/g/l/d0/c;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/e/h;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/e/h<",
            "La/g/l/d0/c;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, La/e/h;->c()I

    move-result p1

    return p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, La/e/h;

    invoke-virtual {p0, p1}, La/i/b/a$b;->a(La/e/h;)I

    move-result p1

    return p1
.end method

.method public a(La/e/h;I)La/g/l/d0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/e/h<",
            "La/g/l/d0/c;",
            ">;I)",
            "La/g/l/d0/c;"
        }
    .end annotation

    invoke-virtual {p1, p2}, La/e/h;->d(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La/g/l/d0/c;

    return-object p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 0

    check-cast p1, La/e/h;

    invoke-virtual {p0, p1, p2}, La/i/b/a$b;->a(La/e/h;I)La/g/l/d0/c;

    move-result-object p1

    return-object p1
.end method
