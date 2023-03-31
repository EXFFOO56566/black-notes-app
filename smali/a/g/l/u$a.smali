.class final La/g/l/u$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/g/l/u;->a(Landroid/view/View;La/g/l/r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:La/g/l/r;


# direct methods
.method constructor <init>(La/g/l/r;)V
    .locals 0

    iput-object p1, p0, La/g/l/u$a;->a:La/g/l/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 1

    invoke-static {p2}, La/g/l/c0;->a(Ljava/lang/Object;)La/g/l/c0;

    move-result-object p2

    iget-object v0, p0, La/g/l/u$a;->a:La/g/l/r;

    invoke-interface {v0, p1, p2}, La/g/l/r;->a(Landroid/view/View;La/g/l/c0;)La/g/l/c0;

    move-result-object p1

    invoke-static {p1}, La/g/l/c0;->a(La/g/l/c0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowInsets;

    return-object p1
.end method
