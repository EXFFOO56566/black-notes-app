.class public final Lcom/google/android/gms/internal/ads/m1;
.super Lcom/google/android/gms/common/internal/w/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/ads/m1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:I

.field public final c:Z

.field public final d:I

.field public final e:Z

.field public final f:I

.field public final g:Lcom/google/android/gms/internal/ads/er2;

.field public final h:Z

.field public final i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/p1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/p1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/m1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IZIZILcom/google/android/gms/internal/ads/er2;ZI)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/w/a;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/m1;->b:I

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/m1;->c:Z

    iput p3, p0, Lcom/google/android/gms/internal/ads/m1;->d:I

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/m1;->e:Z

    iput p5, p0, Lcom/google/android/gms/internal/ads/m1;->f:I

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/m1;->g:Lcom/google/android/gms/internal/ads/er2;

    iput-boolean p7, p0, Lcom/google/android/gms/internal/ads/m1;->h:Z

    iput p8, p0, Lcom/google/android/gms/internal/ads/m1;->i:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/ads/s/d;)V
    .locals 9

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/d;->f()Z

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/d;->b()I

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/d;->e()Z

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/d;->a()I

    move-result v5

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/d;->d()Lcom/google/android/gms/ads/q;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/er2;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/d;->d()Lcom/google/android/gms/ads/q;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/er2;-><init>(Lcom/google/android/gms/ads/q;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v6, v0

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/d;->g()Z

    move-result v7

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/d;->c()I

    move-result v8

    const/4 v1, 0x4

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/ads/m1;-><init>(IZIZILcom/google/android/gms/internal/ads/er2;ZI)V

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/m1;->b:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;II)V

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/m1;->c:Z

    const/4 v2, 0x2

    invoke-static {p1, v2, v1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;IZ)V

    iget v1, p0, Lcom/google/android/gms/internal/ads/m1;->d:I

    const/4 v2, 0x3

    invoke-static {p1, v2, v1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;II)V

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/m1;->e:Z

    const/4 v2, 0x4

    invoke-static {p1, v2, v1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;IZ)V

    iget v1, p0, Lcom/google/android/gms/internal/ads/m1;->f:I

    const/4 v2, 0x5

    invoke-static {p1, v2, v1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/m1;->g:Lcom/google/android/gms/internal/ads/er2;

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/m1;->h:Z

    const/4 v1, 0x7

    invoke-static {p1, v1, p2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;IZ)V

    iget p2, p0, Lcom/google/android/gms/internal/ads/m1;->i:I

    const/16 v1, 0x8

    invoke-static {p1, v1, p2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;II)V

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;I)V

    return-void
.end method
