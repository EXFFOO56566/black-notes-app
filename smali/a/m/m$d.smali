.class La/m/m$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/m/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field a:Landroid/view/View;

.field b:Ljava/lang/String;

.field c:La/m/s;

.field d:La/m/m0;

.field e:La/m/m;


# direct methods
.method constructor <init>(Landroid/view/View;Ljava/lang/String;La/m/m;La/m/m0;La/m/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/m/m$d;->a:Landroid/view/View;

    iput-object p2, p0, La/m/m$d;->b:Ljava/lang/String;

    iput-object p5, p0, La/m/m$d;->c:La/m/s;

    iput-object p4, p0, La/m/m$d;->d:La/m/m0;

    iput-object p3, p0, La/m/m$d;->e:La/m/m;

    return-void
.end method
