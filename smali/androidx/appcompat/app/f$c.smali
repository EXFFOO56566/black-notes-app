.class Landroidx/appcompat/app/f$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/g/l/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/app/f;->y()Landroid/view/ViewGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/app/f;


# direct methods
.method constructor <init>(Landroidx/appcompat/app/f;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/app/f$c;->a:Landroidx/appcompat/app/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;La/g/l/c0;)La/g/l/c0;
    .locals 4

    invoke-virtual {p2}, La/g/l/c0;->d()I

    move-result v0

    iget-object v1, p0, Landroidx/appcompat/app/f$c;->a:Landroidx/appcompat/app/f;

    invoke-virtual {v1, v0}, Landroidx/appcompat/app/f;->j(I)I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, La/g/l/c0;->b()I

    move-result v0

    invoke-virtual {p2}, La/g/l/c0;->c()I

    move-result v2

    invoke-virtual {p2}, La/g/l/c0;->a()I

    move-result v3

    invoke-virtual {p2, v0, v1, v2, v3}, La/g/l/c0;->a(IIII)La/g/l/c0;

    move-result-object p2

    :cond_0
    invoke-static {p1, p2}, La/g/l/u;->a(Landroid/view/View;La/g/l/c0;)La/g/l/c0;

    move-result-object p1

    return-object p1
.end method
