.class public Lb/c/b/b/z/j;
.super Lb/c/b/b/z/d;
.source ""


# instance fields
.field a:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lb/c/b/b/z/d;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lb/c/b/b/z/j;->a:F

    return-void
.end method


# virtual methods
.method public a(Lb/c/b/b/z/m;FFF)V
    .locals 7

    mul-float v0, p4, p3

    const/high16 v1, 0x43340000    # 180.0f

    sub-float v2, v1, p2

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v0, v1, v2}, Lb/c/b/b/z/m;->a(FFFF)V

    const/high16 v0, 0x40000000    # 2.0f

    mul-float p4, p4, v0

    mul-float v4, p4, p3

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/high16 v5, 0x43340000    # 180.0f

    move-object v0, p1

    move v3, v4

    move v6, p2

    invoke-virtual/range {v0 .. v6}, Lb/c/b/b/z/m;->a(FFFFFF)V

    return-void
.end method
