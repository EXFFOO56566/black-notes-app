.class final La/i/b/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/i/b/b$a;


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
        "La/i/b/b$a<",
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
.method public a(La/g/l/d0/c;Landroid/graphics/Rect;)V
    .locals 0

    invoke-virtual {p1, p2}, La/g/l/d0/c;->a(Landroid/graphics/Rect;)V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;Landroid/graphics/Rect;)V
    .locals 0

    check-cast p1, La/g/l/d0/c;

    invoke-virtual {p0, p1, p2}, La/i/b/a$a;->a(La/g/l/d0/c;Landroid/graphics/Rect;)V

    return-void
.end method
