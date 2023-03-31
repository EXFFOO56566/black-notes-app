.class public La/m/b;
.super La/m/q;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, La/m/q;-><init>()V

    invoke-direct {p0}, La/m/b;->u()V

    return-void
.end method

.method private u()V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, La/m/q;->b(I)La/m/q;

    new-instance v1, La/m/d;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, La/m/d;-><init>(I)V

    invoke-virtual {p0, v1}, La/m/q;->a(La/m/m;)La/m/q;

    new-instance v1, La/m/c;

    invoke-direct {v1}, La/m/c;-><init>()V

    invoke-virtual {p0, v1}, La/m/q;->a(La/m/m;)La/m/q;

    new-instance v1, La/m/d;

    invoke-direct {v1, v0}, La/m/d;-><init>(I)V

    invoke-virtual {p0, v1}, La/m/q;->a(La/m/m;)La/m/q;

    return-void
.end method
