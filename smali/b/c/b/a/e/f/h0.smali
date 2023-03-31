.class public final Lb/c/b/a/e/f/h0;
.super Lcom/google/android/gms/common/internal/w/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lb/c/b/a/e/f/h0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:J

.field public final c:J

.field public final d:Z

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb/c/b/a/e/f/j0;

    invoke-direct {v0}, Lb/c/b/a/e/f/j0;-><init>()V

    sput-object v0, Lb/c/b/a/e/f/h0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/w/a;-><init>()V

    iput-wide p1, p0, Lb/c/b/a/e/f/h0;->b:J

    iput-wide p3, p0, Lb/c/b/a/e/f/h0;->c:J

    iput-boolean p5, p0, Lb/c/b/a/e/f/h0;->d:Z

    iput-object p6, p0, Lb/c/b/a/e/f/h0;->e:Ljava/lang/String;

    iput-object p7, p0, Lb/c/b/a/e/f/h0;->f:Ljava/lang/String;

    iput-object p8, p0, Lb/c/b/a/e/f/h0;->g:Ljava/lang/String;

    iput-object p9, p0, Lb/c/b/a/e/f/h0;->h:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-wide v0, p0, Lb/c/b/a/e/f/h0;->b:J

    const/4 v2, 0x1

    invoke-static {p1, v2, v0, v1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;IJ)V

    iget-wide v0, p0, Lb/c/b/a/e/f/h0;->c:J

    const/4 v2, 0x2

    invoke-static {p1, v2, v0, v1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;IJ)V

    iget-boolean v0, p0, Lb/c/b/a/e/f/h0;->d:Z

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Lb/c/b/a/e/f/h0;->e:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {p1, v2, v0, v1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lb/c/b/a/e/f/h0;->f:Ljava/lang/String;

    const/4 v2, 0x5

    invoke-static {p1, v2, v0, v1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lb/c/b/a/e/f/h0;->g:Ljava/lang/String;

    const/4 v2, 0x6

    invoke-static {p1, v2, v0, v1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lb/c/b/a/e/f/h0;->h:Landroid/os/Bundle;

    const/4 v2, 0x7

    invoke-static {p1, v2, v0, v1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    invoke-static {p1, p2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;I)V

    return-void
.end method
