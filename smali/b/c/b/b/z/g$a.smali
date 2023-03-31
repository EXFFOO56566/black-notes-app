.class Lb/c/b/b/z/g$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/c/b/b/z/l$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/c/b/b/z/g;-><init>(Lb/c/b/b/z/g$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/c/b/b/z/g;


# direct methods
.method constructor <init>(Lb/c/b/b/z/g;)V
    .locals 0

    iput-object p1, p0, Lb/c/b/b/z/g$a;->a:Lb/c/b/b/z/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb/c/b/b/z/m;Landroid/graphics/Matrix;I)V
    .locals 1

    iget-object v0, p0, Lb/c/b/b/z/g$a;->a:Lb/c/b/b/z/g;

    invoke-static {v0}, Lb/c/b/b/z/g;->b(Lb/c/b/b/z/g;)[Lb/c/b/b/z/m$g;

    move-result-object v0

    invoke-virtual {p1, p2}, Lb/c/b/b/z/m;->a(Landroid/graphics/Matrix;)Lb/c/b/b/z/m$g;

    move-result-object p1

    aput-object p1, v0, p3

    return-void
.end method

.method public b(Lb/c/b/b/z/m;Landroid/graphics/Matrix;I)V
    .locals 1

    iget-object v0, p0, Lb/c/b/b/z/g$a;->a:Lb/c/b/b/z/g;

    invoke-static {v0}, Lb/c/b/b/z/g;->a(Lb/c/b/b/z/g;)[Lb/c/b/b/z/m$g;

    move-result-object v0

    invoke-virtual {p1, p2}, Lb/c/b/b/z/m;->a(Landroid/graphics/Matrix;)Lb/c/b/b/z/m$g;

    move-result-object p1

    aput-object p1, v0, p3

    return-void
.end method
